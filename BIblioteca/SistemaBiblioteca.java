import java.sql.*;
import java.util.Scanner;

public class SistemaBiblioteca {

	private static final String URL = "jdbc:postgresql://localhost:5432/Biblioteca";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "123456";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            criarTabelaSeNaoExiste(conexao);

            int opcao;
            do {
                exibirMenu();
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        listarLivros(conexao);
                        break;
                    case 2:
                        cadastrarLivro(conexao, scanner);
                        break;
                    case 3:
                        emprestarLivro(conexao, scanner);
                        break;
                    case 4:
                        devolverLivro(conexao, scanner);
                        break;
                    case 5:
                        removerLivro(conexao, scanner);
                        break;
                    case 0:
                        System.out.println("Saindo do sistema... Até logo!");
                        break;
                    default:
                        System.out.println("Opção inválida! Tente novamente.");
                }
                System.out.println();
            } while (opcao != 0);

        } catch (SQLException e) {
            System.err.println("Erro de conexão com o banco de dados: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static void exibirMenu() {
        System.out.println("=== Biblioteca ===");
        System.out.println("1. Listar livros");
        System.out.println("2. Cadastrar livro");
        System.out.println("3. Emprestar livro");
        System.out.println("4. Devolver livro");
        System.out.println("5. Remover livro");
        System.out.println("0. Sair");
        System.out.print("Opção: ");
    }

    private static void criarTabelaSeNaoExiste(Connection conexao) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS livros ("
                   + "id SERIAL PRIMARY KEY, "
                   + "titulo TEXT NOT NULL, "
                   + "autor TEXT NOT NULL, "
                   + "ano INTEGER NOT NULL, "
                   + "disponivel INTEGER NOT NULL"
                   + ");";
        try (Statement stmt = conexao.createStatement()) {
            stmt.execute(sql);
        }
    }

    private static void listarLivros(Connection conexao) {
        String sql = "SELECT id, titulo, autor, ano, disponivel FROM livros ORDER BY titulo ASC";

        try (Statement stmt = conexao.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            boolean encontrou = false;
            while (rs.next()) {
                encontrou = true;
                int id = rs.getInt("id");
                String titulo = rs.getString("titulo");
                String autor = rs.getString("autor");
                int ano = rs.getInt("ano");
                int disponivel = rs.getInt("disponivel");

                String situacao = (disponivel == 1) ? "DISPONIVEL" : "EMPRESTADO";

                System.out.printf("[%d] %s - %s (%d) - %s%n", id, titulo, autor, ano, situacao);
            }

            if (!encontrou) {
                System.out.println("Nenhum livro cadastrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao listar livros: " + e.getMessage());
        }
    }
    private static void cadastrarLivro(Connection conexao, Scanner scanner) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();
        System.out.print("Autor: ");
        String autor = scanner.nextLine();
        System.out.print("Ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); 
        String sql = "INSERT INTO livros (titulo, autor, ano, disponivel) VALUES (?, ?, ?, 1)";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setString(1, titulo);
            pstmt.setString(2, autor);
            pstmt.setInt(3, ano);

            pstmt.executeUpdate();
            System.out.println("Livro cadastrado com sucesso!");

        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar livro: " + e.getMessage());
        }
    }

    private static void emprestarLivro(Connection conexao, Scanner scanner) {
        System.out.print("Digite o ID do livro para emprestar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "UPDATE livros SET disponivel = 0 WHERE id = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int linhasAfetadas = pstmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Livro emprestado com sucesso!");
            } else {
                System.out.println("Livro com ID " + id + " não foi encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao emprestar livro: " + e.getMessage());
        }
    }

    private static void devolverLivro(Connection conexao, Scanner scanner) {
        System.out.print("Digite o ID do livro para devolver: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "UPDATE livros SET disponivel = 1 WHERE id = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int linhasAfetadas = pstmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Livro devolvido com sucesso!");
            } else {
                System.out.println("Livro com ID " + id + " não foi encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao devolver livro: " + e.getMessage());
        }
    }

    private static void removerLivro(Connection conexao, Scanner scanner) {
        System.out.print("Digite o ID do livro para remover: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        String sql = "DELETE FROM livros WHERE id = ?";

        try (PreparedStatement pstmt = conexao.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int linhasAfetadas = pstmt.executeUpdate();

            if (linhasAfetadas > 0) {
                System.out.println("Livro removido com sucesso!");
            } else {
                System.out.println("Livro com ID " + id + " não foi encontrado.");
            }

        } catch (SQLException e) {
            System.out.println("Erro ao remover livro: " + e.getMessage());
        }
    }
}