package atividade;

public class No {
    private int elemento;
    private No proximo;

    public No(int elemento) {//primeiro nó
        this.elemento = elemento;// nó recebe elemento inteiro
        this.proximo = null; //não há proximo
    }

    public int getElemento() { //qual o elemento?
        return elemento;
    }

    public void setElemento(int elemento) { //void não retorna
        this.elemento = elemento; //this.elemento refere a private int elemento; elemento refere a int elemento
    }

    public No getProximo() { //qual o elemento do proximo?
        return proximo;
    }

    public void setProximo(No proximo) { //define o proximo nó
        this.proximo = proximo;
    }

}
