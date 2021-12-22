package at.spengergasse.sprolernen.domain;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErsteContolle {

    @RequestMapping(value = "/")
    public String halloControlle()
    {
        return "Hallooo Edward";
    }
}
