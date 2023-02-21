public class Ej_Java{

   public static void main(String args[]){

   String a = "Hola";
   int x = a.length();
   System.out.println("");
   System.out.println("Numero caracteres a = " + x);
   System.out.println("");
   
   String a1 = "Hola";
   boolean b1 = a1.isEmpty();
   System.out.println("b1");
   System.out.println("");
   
   String a2 = "";
   boolean b2 = a2.isEmpty();
   System.out.println(b2);
   System.out.println("");

   String t = "Hola";
   for(int i = 0; i < t.length(); i++){

    char c = t.charAt(i);
    System.out.print(c);
  }   

   System.out.println("\n");

   String x1 = "Hola";
   String y = "Hola";
   if(x1.equals(y)){

    System.out.println("Si pasa por aqui!");
  }else{

    System.out.println("Vas para atras!");
  }

   System.out.println("");

   String s = "Hola, como estas?";
   int p1 = s.indexOf('a');
   int p2 = s.lastIndexOf('a');
   System.out.println("Primera posicion letra a = " + p1);
   System.out.println("Ultima posicion letra a = " + p2);
   System.out.println("");

   String h = "Hola, como estas? Estas como querias?";
   int h1 = h.indexOf("como");
   int h2 = h.indexOf("estas");
   int h3 = h.lastIndexOf("como");

   System.out.println("Posicion primera letra de primera palabra 'como' = " + h1);
   System.out.println("Posicion primera letra de primera palabra 'estas' = " + h2);
   System.out.println("Posicion ultima letra ultima palabra 'como' = " + h3);
   System.out.println("");

   String t1 = "Hola, como estas?";
   String may = t1.toUpperCase();
   String min = t1.toLowerCase();

   System.out.println(may);
   System.out.println(min);
   System.out.println("");

   String s1 = "Hola, como estas?";
   String s2 = s1.substring(0,4);
   String s3 = s1.substring(6,10);
   String s4 = s1.substring(11,17);
 
   System.out.println(s2);
   System.out.println(s3);
   System.out.println(s4);
   System.out.println("");

   String l1 = "1234";
   int j1 = Integer.parseInt(l1);
   String g1 = Integer.toString(j1);

   System.out.println(l1);
   System.out.println(j1);
   System.out.println(g1);   


   String q = "Hola, ";
   String w = "que tal";
   String e = q + w;

   System.out.println(e);
   System.out.println("");

   String r = "Hola";
   r = "chau";
   System.out.println(r);
   System.out.println("");

   StringBuilder sb = new StringBuilder();
   sb.append("Hola, ");
   sb.append("Chau");
   System.out.println(sb);
 }
}