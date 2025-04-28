package stringmethods;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Pedro Tomáz";
        String spacedName = "      Travis Scott       ";

        // Example = Check minimum characters of a password
        int length = name.length();

        // Definition = Which letter is at the position n, obs: starts at 0
        char letter = name.charAt(2);

        // Definition = Identify position by the letter
        int index = name.indexOf("d");

        // Definition = Identify the position of the last occurrence letter
        int lastIndex = name.lastIndexOf("o");

        // Definition = Turn upper case, in this case I'm wrapping, but isn't always
        String nameUpperCase = name.toUpperCase(Locale.of(name));

        // Definition = Turn lower case, in this case I'm wrapping, but isn't always
        String nameLowerCase = name.toLowerCase(Locale.of(name));

        // Definition = Removes the white spaces at the variable
        spacedName = spacedName.trim();

        // Definition = Replaces every ("firstArgument" with "secondArgument")
        name = name.replace("o", "u");

        // Definition = Returns true or false if it's empty or not
        System.out.println("Is the name empty ? (true/false): " + name.isEmpty());

        // Definition = Returns true or false if it's contains(yourArgument)
        System.out.println("Is the name contains any white spaces ? (true/false): " + name.contains(" "));

        // Definition = Returns true or false if it's the variable is equals to (yourArgument)
        System.out.println("Is the name equals to " + name + "? (true/false): " + name.equals(spacedName));

        // Definition = Returns true or false if it's the variable is equals to (yourArgument) but without CamelCase
        System.out.println("Is the name equals to " + name + "but in ignoreCase ? (true/false): " + name.equalsIgnoreCase("pedru tumáz"));

        System.out.println("There are " + length + " letters in your name!");
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(nameUpperCase);
        System.out.println(nameLowerCase);
        System.out.println(spacedName);
        System.out.println(name);
    }
}
