package in.debjitpal.demo_project_1;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstAPI {

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello Spring ! This is my First API ";
    }
    @RequestMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name){
        return "Debjit : Hello Spring ! This is my First API "+"Spring : Ok " + name;
        //return "Hello "+name;
    }
    @RequestMapping("/hello/{name}/{times}")
    public String sayName(@PathVariable("name") String name, @PathVariable("times") int times){
        String str="";
        for(int i=0; i<times; i++){
            str+=name+" "+(i+1);
            str+="<br>";
        }
        return str;
    }
}
