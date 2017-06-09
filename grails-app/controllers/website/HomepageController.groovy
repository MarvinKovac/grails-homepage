package website

import org.springframework.web.servlet.ModelAndView

class HomepageController {
    int counter = 0;
    int counter_insta = 0;
    int counter_yout = 0;

    public ModelAndView index() {
        render view: "index", model: [counter: counter, counter1: counter_insta,counter2:counter_yout]
    }


    public counter() {
        counter = counter + 1;
        redirect actionName: "index"

    }



    public counterInsta() {
        counter_insta = counter_insta + 1;
        redirect url: "https://www.instagram.com/kovac_marvin/?hl=de"
    }
    public counterYout(){
        counter_yout = counter_yout +1;
        redirect url: "https://www.youtube.com/channel/UC2uACO3yOOmpz1uAzRoPopw"
    }


}
