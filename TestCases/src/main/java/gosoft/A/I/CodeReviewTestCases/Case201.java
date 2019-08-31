package gosoft.A.I.CodeReviewTestCases;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("hello")  // Noncompliant; this doesn't get cleaned up
public class Case201 {

}
