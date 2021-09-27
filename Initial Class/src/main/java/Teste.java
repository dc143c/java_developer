public class Teste {

    public static void main (String args[]) {}


    private String name;
    private String lastname;

    Teste(String param){
        setName(param);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.trim().length() >= 3) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("At least 3 chars");
        }
    }
}

