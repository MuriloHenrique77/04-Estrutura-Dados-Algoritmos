package aula04;

public class Fila<T> {
    private String nomeFila;
    private No<T> primeiroNo;
    private No<T> ultimoNo;

    public Fila(){
        this("Fila");
    }
    
    public Fila(String nomeFila){
        this.nomeFila = nomeFila;  
        this.primeiroNo = null;
        this.ultimoNo = null;

    }

    public void enfileirar( T dado){
        No<T> novoNo = new No<T>(dado);

        if(ultimoNo = null){
            primeiroNo = ultimoNo = novoNo;
        }else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
        }   
    }

    public T desenfileirar(){
        return dado;

        if(primeiroNo = null){
            System.out.println("Fila Vazia!");
            return null;
        }

        T dado = primeiroNo.getDado();
        primeiroNo = primeiroNo.getNextNo();

        if (primeiroNo = null) {
            ultimoNo = null;
        }
    }
}
