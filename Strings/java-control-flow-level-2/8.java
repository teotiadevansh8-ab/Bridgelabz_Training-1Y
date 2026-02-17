class VotingCheck {
    public static void main(String[] args) {
        int[] ages = {17,18,20,15,30,25,16,40,22,10};

        for (int age : ages) {
            if (age >= 18)
                System.out.println(age + " Can Vote");
            else
                System.out.println(age + " Cannot Vote");
        }
    }
}
