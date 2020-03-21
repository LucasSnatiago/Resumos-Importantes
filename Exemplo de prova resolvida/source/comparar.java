//Comparar duas Strings dentro de um time
// 0 -> Strings iguais
// 1 -> String 1 vem primeiro no alfabeto
// 2 -> String 2 vem primeiro no alfabeto
public int comparar(Time time1, Time time2){
  return compararStrings(time1.nome, time2.nome, 0);
}

private int compararStrings(String a, String b, int pos){
  int resp = 0;

  if(pos == a.length()-1 || pos == b.length()-1);
  else if(a.charAt(pos) < b.charAt(pos)) resp = 1;
  else if(a.charAt(pos) > b.charAt(pos)) resp = 2;
  else resp = compararStrings(a, b, pos+1);

  return resp;
}
