package controllers;

public class skillController {
    @GetMapping("/")
    @ResponseBody
    public String skillForm(){
        String html = "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <title>Skills Tracker</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Skills Tracker</h1>\n" +
                "<p>We have a few skills we would like to learn. Here is the list!</p>\n" +
                "<ol>\n" +
                "    <li>Java</li>\n" +
                "    <li>JavaScript</li>\n" +
                "    <li>Python</li>\n" +
                "</ol>\n" +
                "</body>\n" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String skillsForm(){
        String html = "<html>\n" +
                "<head>\n" +
                "    <title>Skills Tracker Form</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Skills Tracker</h1>\n" +
                "<form method='post' action=\"/form\"></form>\n" +
                "Name: <input type=\"text\" name ='name'><br></br>\n" +
                "My First Favourite Language: <select name ='firstLanguage'>\n" +
                "<option value=\"Java\">Java</option>\n" +
                "<option value=\"JavaScript\">JavaScript</option>\n" +
                "<option value=\"Python\">Python</option>\n" +
                "</select><br></br>\n" +
                "My Second Favourite Language:<select name ='secondLanguage'>\n" +
                "    <option value=\"Java\">Java</option>\n" +
                "    <option value=\"JavaScript\">JavaScript</option>\n" +
                "    <option value=\"Python\">Python</option>\n" +
                "</select>\n" +
                "<input type='submit' value='Submit'>"+
                "</body>\n" +
                "</html>";
        return  html;
    }

}
