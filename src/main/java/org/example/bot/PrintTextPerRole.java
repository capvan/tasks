// https://stepik.org/lesson/12762/step/10?unit=3110

private String printTextPerRole(String[] roles, String[] textLines) {

    StringBuilder result = new StringBuilder();

    for (String role : roles) {
        result.append(role).append(":" + "\n");

//        for (String text : textLines) {
        for (int i = 0; i < textLines.length; i++) {
            String text = textLines[i];

            if (text.startsWith(role + ":")) {
                result.append(i + 1).append(")").append(text.substring(text.indexOf(":") + 1)).append("\n");
//                String index = role + ":";
//                result.toString().replace(role + ":", "");
            }

        }
        result.append("\n");
//        }
//String newRole = role + ":";
//                if (text.startsWith(role + ":")) {
//                    result.toString().replaceFirst(role + ":", "xer");
//                }
//            }
    }

    System.out.println(result.toString());
    return result.toString();
}

public void main() {
    String[] roles = {
            "Городничий",
            "Аммос Федорович",
            "Артемий Филиппович",
            "Лука Лукич"
    };
    String[] textLines = {
            "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
            "Аммос Федорович: Как ревизор?",
            "Артемий Филиппович: Как ревизор?",
            "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
            "Аммос Федорович: Вот те на!",
            "Артемий Филиппович: Вот не было заботы, так подай!",
            "Лука Лукич: Господи боже! еще и с секретным предписаньем!"
    };
    printTextPerRole(roles, textLines);
}
