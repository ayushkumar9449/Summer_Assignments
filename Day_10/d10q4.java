class AlphabetPyramid 
{
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) 
            {
            for (int j = i; j < 5; j++) 
            {
                System.out.print(" ");
            }
            for (char ch = 'A'; ch < 'A' + i; ch++) 
            {
                System.out.print(ch);
            }
            for (char ch = (char)('A' + i - 2); ch >= 'A'; ch--) 
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
