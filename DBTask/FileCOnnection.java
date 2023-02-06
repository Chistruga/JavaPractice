package DBTask;

import java.io.*;

public class FileCOnnection {
    public static void main(String[] args) throws IOException
    {
        File f1=new File("C:\\Users\\dchistruga\\OneDrive - ENDAVA\\Desktop\\input.txt"); //Creation of File Descriptor for input file
        String[] words=null;
        FileReader fr = new FileReader(f1);
        BufferedReader br = new BufferedReader(fr);
        String s;
        String input="Java";
        int count=0;
        while((s=br.readLine())!=null)
        {
            words=s.split(" ");
            for (String word : words)
            {
                if (word.equals(input))
                {
                    count++;
                }
            }
        }
        if(count!=0)
        {
            String toBeWrittenInTxtFile = "The given word is present for "+count+ " Times in the file";
            try {
                FileWriter fWriter = new FileWriter("C:\\Users\\dchistruga\\OneDrive - ENDAVA\\Desktop\\demo.txt");
                fWriter.write(toBeWrittenInTxtFile);
                fWriter.close();
                System.out.println("File is created successfully with the content.");
            }
            catch (IOException e) {
                System.out.print(e.getMessage());
            }
        }
        else
        {
            System.out.println("The given word is not present in the file");
        }

        fr.close();
    }

}
