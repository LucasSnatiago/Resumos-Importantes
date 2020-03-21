//Retorna se existe o elemento chave dentro do array
public boolean pesquisaBinaria(int[] array, int chave){
  boolean resp = false;
  int esq = 0;
  int dir = array.length()-1;
  int pos = (esq + dir)/2;

  while(esq <= dir){
    pos = (esq + dir)/2;

    if(chave < array[pos]) dir = pos-1;
    else if(chave > array[pos]) esq = pos+1;
    else if(chave == array[pos]) resp = true;
    else esq = dir+1;

  }
  
  return resp;
}
