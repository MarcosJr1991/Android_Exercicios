package testelistviewerecyclerview.com.testelistviewerecyclerview.model;

public enum EstadoAtual {
    Fazendo {
        @Override
        public String toString() {
            return "Fazendo o curso";
        }
    },
    Finalizado{
        @Override
        public String toString(){return "finalizando";}


    }
}
