package Egzamin;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class luty9_03v3 {
    public static void main(String[] args) {
        String s, łańcuch=null, wszy;
        String[] tab;
        int a = 'a';
        int z = 'z';
        int zmienna=0, znak=0, poprawność=-1, kod_znaku, znaczek;
        try{
            BufferedReader br = new BufferedReader(new FileReader("a_moje1.txt"));
                do{
                    s = br.readLine();
                    if(s!=null){
                        tab = s.split(" ");
                        łańcuch = tab[0];
                    }
                }while(s!=null);
            FileReader fr = new FileReader("a_moje1.txt");
                do{
                    kod_znaku = fr.read();
                    if((kod_znaku>=a)&&(kod_znaku<=z)) zmienna++;
                    znaczek = (char)kod_znaku;
                    if((znaczek=='+')||(znaczek=='-')||(znaczek=='*')||(znaczek=='/')) znak++;
                }while(kod_znaku!=-1);
            if((zmienna-1)==znak) poprawność = 1;
            else poprawność = 0;
            StringBuffer sb = new StringBuffer(łańcuch);
                sb.append(" ");
                sb.append(poprawność);
                wszy = sb.toString();
            PrintWriter pw = new PrintWriter(new FileWriter("a_moje1.txt",false),false);
                pw.println(wszy);
        br.close();
        pw.close();
        fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
}
