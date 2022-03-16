package pl.sdacademy.java.basic.exercises.day3.Task7;

public class main {
    public static void main(String[] args) {
      Poem[] poems = initData();
      getSurnameWithMaxStropheNumbers(poems);

      Author author = getSurnameWithMaxStropheNumbers_2(poems);
        System.out.println(author);

    }

    private static Poem[] initData() {
        Author author1 = new Author("Mickiewicz", "Polish");
        Author author2 = new Author("Tolkien", "English");
        Author author3 = new Author("Martin", "American");

        Poem[] poems = new Poem[3];
        poems[0] =  new Poem(author2, 600);;
        poems[1] =  new Poem(author1, 1250);;
        poems[2] = new Poem(author3, 20);;

        String author = getSurnameWithMaxStropheNumbers(poems);
        System.out.println(author);
        return poems;

    }

    private static String getSurnameWithMaxStropheNumbers(Poem[] poems){
        int max = 0;
        String surname = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumber();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                surname = poem.getCreator().getSurname();
            }
        }
        return surname;
    }

    private static Author getSurnameWithMaxStropheNumbers_2(Poem[] poems){
        int max = 0;
        Author author = null;
        for(Poem poem : poems) {
            int currentStropheNumbers = poem.getStropheNumber();
            if(max < currentStropheNumbers) {
                max = currentStropheNumbers;
                author = poem.getCreator();
            }
        }
        return author;
    }


}
