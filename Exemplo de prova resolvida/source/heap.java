public int maiorHeap(int pos){
  int maior;

  if(pos *2 +1 <= n){
    maior = Math.max(maiorHeap(pos*2), maiorHeap(pos*2+1));
  }
  else if(pos *2 == n) maior = array[pos*2];
  else array[pos];

  return maior;
}

public int maiorHeapEsq(){
  return maiorHeap(1);
}
