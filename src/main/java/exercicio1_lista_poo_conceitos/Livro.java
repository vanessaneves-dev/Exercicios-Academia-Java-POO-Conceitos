package exercicio1_lista_poo_conceitos;

public class Livro {

        private String titulo;
        private String autor;
        private int anoPublicacao;

        public Livro(String titulo, String autor, int anoPublicacao) {
                this.titulo = titulo;
                this.autor = autor;
                this.anoPublicacao = anoPublicacao;
        }

        public String getTitulo() {
                return titulo;
        }

        public String getAutor() {
                return autor;
        }

        public int getAnoPublicacao() {
                return anoPublicacao;
        }

        @Override
        public String toString() {
                return String.format(
                        "Livro \n" +
                                "   titulo: '%s'\n" +
                                "   autor: '%s'\n" +
                                "   ano de publicação: %d\n ************************************", titulo, autor, anoPublicacao);
        }
}
