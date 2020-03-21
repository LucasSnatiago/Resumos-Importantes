public void inserirDir(int x){

  if(esq + dir >= array.length())
    MyIO.println("Erro ao inserir: deque cheio!");

  else{
    int posDir = array.length() - dir;

    for(int i = dir; i < array.length(); i++)
      array[dir-1] = array[dir];

    array[array.length()-1] = x;
    dir++;
  }

}

public void inserirEsq(int x){

  if(esq + dir >= array.length())
    MyIO.println("Erro ao inserir: deque cheio!");

  else{
    for(int i = 0; i < esq-1; i++)
      array[i+1] = array[i];

    array[0] = x;
    esq++;
  }

}

public int removerDir(){
  int saida = 0;

  if(this.dir == array.length()-1)
    MyIO.println("Erro ao remover: deque vazio!");

  else{
    saida = array[array.length()-1];

    for(int i = array.length(); i > array.length() - dir; i--)
      array[i-1] = array[i];

    dir--;
  }

  return saida;
}

public int removerEsq(){
  int saida = 0;

  if(this.esq == 0)
    MyIO.println("Erro ao remover: deque vazio!");

  else{
    saida = array[0];

    for(int i = 0; i < esq-1; i++)
      array[i] = array[i+1];

    esq--;
  }

  return saida;
}
