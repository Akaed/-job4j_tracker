package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        if (key == null) {
            throw new ElementNotFoundException("Url could not be null");
        }
        int rsl = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] arraynumb = {"Ebay", "Amazon", "Ozon"};
        try {
            System.out.println(indexOf(arraynumb, "Amazon"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
