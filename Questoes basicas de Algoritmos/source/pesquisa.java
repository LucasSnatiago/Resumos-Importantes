//Retorna se há o elemento chave em um vetor de inteiros
public boolean pesquisar(int[] array, int chave){
  boolean resp = false;

  for(int i = 0; i < n; i++){
    if(array[i] == chave){
      resp = true;
      i = n;
    }
  }

  return resp;
}
