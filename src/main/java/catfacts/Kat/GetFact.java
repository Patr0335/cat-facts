package catfacts.Kat;


import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;

public class GetFact {
    private String text;
    private String text2 = text + "\n";
    private Date createdAt;
    private Date updatedAt;

    public String CatFact() throws IOException {
        URL catURL= new URL("http://cat-fact.herokuapp.com/facts/random");
        BufferedReader inputFromCatUrl = new BufferedReader(new InputStreamReader(catURL.openStream()));
        GetFact singleCatFact = new Gson().fromJson(inputFromCatUrl,GetFact.class);
        //System.out.println(singleCatFact);
        return "" + singleCatFact;

    }

    public String TenCatFacts() throws IOException{
      ArrayList<GetFact> cats = new ArrayList<>();
      for (int i = 0; i< 10; i++) {
          URL catURL= new URL("http://cat-fact.herokuapp.com/facts/random");
          BufferedReader inputFromCatUrl = new BufferedReader(new InputStreamReader(catURL.openStream()));
          GetFact singleCatFact = new Gson().fromJson(inputFromCatUrl,GetFact.class);
          cats.add(singleCatFact);
      }
        System.out.println(cats);
      String s = "";
      for (int i =0; i< cats.size(); i++) {
          s += cats.get(i) + "\n";
          //System.out.println(cats.get(i)+ "\n");
      }
        return "" + s;
    }

    @Override
    public String toString() {
        return "Fact: " + text;

    }

}
