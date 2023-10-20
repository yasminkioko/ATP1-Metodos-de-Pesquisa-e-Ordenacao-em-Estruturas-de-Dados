package atividade;

public class Lista {

    private No primeiro=null;

//Deverá ter um objeto com o endereço do primeiro elemento da lista.
    public No getPrimeiro(){
        return primeiro;
    }
//Método vazia: deverá verificar se a lista está vazia ou não.
    public boolean Vazia(){ //boolean, portanto verdadeiro ou falso
        if (primeiro == null){
            return true;
        }
        else{
            return false;
        }

    }
//Método inserePrimeiro: deverá inserir um valor no início da lista.
    public void inserePrimeiro(int elemento){
        No no = new No(elemento);

        no.setElemento(elemento);
        no.setProximo(primeiro);

        primeiro = no;

    }

//Método insereDepois: deverá inserir um valor depois de um nó específico da lista, deverá passar este nó como parâmetro na chamada do método.
    public void insereDepois(No no, int elemento){
        No no1 =  new No(elemento);
        no1.setProximo(no.getProximo());
        no.setProximo(no1);
    }


//Método insereUltimo: deverá inserir um valor no fim da lista.
    public void insereUltimo(int elemento){
        if (Vazia()){
            inserePrimeiro(elemento);
        }
        else{
            No n = primeiro;
            while(n.getProximo() != null){
                n=n.getProximo();
            }
            No no = new No(elemento);
            n.setProximo(no);

            }
        }

//Método removePrimeiro: deverá remover o primeiro nó da lista.

        public No removePrimeiro(){

            if(Vazia()){
                System.out.println("Lista Vazia");
                return null;
            }
            else{
                primeiro = primeiro.getProximo();
                return primeiro;
            }

        }

//Método removeUltimo: deverá remover o último nó da lista.

        public void removeUltimo(){

            if(Vazia()){
                System.out.println("Lista Vazia");
            }
            else{

                No anterior;

                for (anterior = primeiro; anterior.getProximo() != null; anterior = anterior.getProximo()){
                    if(anterior.getProximo().getProximo()==null){
                        anterior.setProximo(null);
                        break;
                    }
                }
            }



        }



//Método remove: deverá remover qualquer nó da lista, deverá passar este nó como parâmetro na chamada do método.

    public void removeDepois(No no){

        No anterior = null;
        No p = primeiro;

        while(p.getProximo()!=null){
            anterior = p;
            p = p.getProximo();

            if(p.equals(no)){
                anterior.setProximo(p.getProximo());
            }
        }

}


        


//Método mostrar: deverá mostrar no console todos os itens da lista.
        public void Mostrar(){

            if (Vazia()){
                System.out.println("Lista Vazia");

            }
            else{
                for (No n=primeiro; n!=null; n = n.getProximo()){
                    System.out.println(n.getElemento());
                }
            }
            

        }

}
