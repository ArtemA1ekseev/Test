import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        /*
        String[] in = {"каждый", "охотник", "каждый", "знать", "знать"};
        for (int i = 0; i < in.length; i++) {
            System.out.print(in[i] + " ");
        }

            System.out.println(" ");
            String[] out = Arrays.stream(in).distinct().toArray(String[]::new);


            for (int i = 0; i < out.length; i++) {
                System.out.print(out[i] + " ");
            }
        */
        // Задача 1.

        // объявление двумерного массива строк
        String[][] BookAndAuthor = new String[2][2];

        BookAndAuthor[0][0] = "Название книги: 'Капитанская дочка'";
        BookAndAuthor[1][0] = "Название книги: 'Война и мир'";

        BookAndAuthor[0][1] = "Автор - Александр Сергеевич";
        BookAndAuthor[1][1] = "Автор - Лев Николаевич";

        // вывод результата
        for (int i=0; i<BookAndAuthor.length; i++) {
            for (int j=0; j<BookAndAuthor[i].length; j++)
                System.out.print(BookAndAuthor[i][j] + " ");
            System.out.println();
        }

        // Задача 2.
        /*
        catch (IOException ex) {logger.error(ex);
            throw new MyException(ex.getMessage());
            catch (SQLException ex) {
                logger.error(ex);
                throw new MyException(ex.getMessage());
            }catch (Exception ex) {
                logger.error(ex);
                throw new MyException(ex.getMessage());
            }

        catch(IOException | SQLException | Exception ex){
            logger.error(ex);
            throw new MyException(ex.getMessage());
        }

        */
    }
}
