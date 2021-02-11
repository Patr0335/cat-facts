package catfacts.Kat;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller
public class MyController {
    GetFact getFact = new GetFact();
    @GetMapping()
    public String Introduction() {
        return "index";
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String GetSingle() throws IOException {
        //GetFact getFact = new GetFact();
        return "" + getFact.CatFact();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String GetTen() throws IOException{
        return "" + getFact.TenCatFacts();
    }

    /*@GetMapping("/getTenSortByDate")
    @ResponseBody
    public String GetTenSortByDate() {
        return "" +
    }*/
}

