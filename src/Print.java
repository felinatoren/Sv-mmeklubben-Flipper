import java.util.ArrayList;

public class Print {

    public void printDate(String date){
        System.out.println(date);
    }
    public String chooseMenuPoint(){
        return "\nVælg menupunkt:";
    }
    public void exitProgramMSG(){
        System.out.println("Programmet lukker ned nu, tak for i dag.");
    }
    public void returnToMainMenu(){                             // muligt kan dropppes
        System.out.println("Returnerer til den administrative menu.\n");
    }
    public void mainMenuDisplay(String date){
        System.out.println("Svømmeklubben Flippers administrative Menu. " + date + "\n");
        System.out.println("1 for Medlems menu.");
        System.out.println("2 for Finans menu.");
        System.out.println("3 for Svømme resultats menu.");
        System.out.println("4 for at lukke programmet.");
    }
    public void memberMenuDisplay(){
        System.out.println("\nMedlems menu.\n");
        System.out.println("1 for registrering af nyt medlem.");
        System.out.println("2 for redigering af eksisterende medlem.");
        System.out.println("3 retur til den administrative menu.");
    }
    public void financeMenuDisplay(){
        System.out.println("\nFinans menu.\n");
        System.out.println("1 for se årsregnskab over kontingenter.");
        System.out.println("2 for at se medlemmer i restance.");
        System.out.println("3 retur til den administrative menu.");
    }
    public void swimResultsMenuDisplay(){
        System.out.println("\nSvømme resultats menu.\n");
        System.out.println("1 for se top 5 svømme tider i alle discipliner.");
        System.out.println("2 for at indtaste konkurrence resultat.");
        System.out.println("3 for at indtaste trænings resultat.");
        System.out.println("4 retur til den administrative menu.");
    }

    public void printString(String print){
        System.out.println(print);
    }
    public void printMember(Member member){

        if (member instanceof Elite){
            System.out.println((Elite)member);
        } else if (member instanceof Casual){
            System.out.println((Casual)member);
        } else {
            System.out.println("Medlem er null");
        }

    }


    public void printSwimTypes(ArrayList<SwimType> list){
        // TODO EVT FÅ DEN TIL AT PRINTE DEM LIDT PÆNNERE UD
        System.out.println("Svømme dicipliner:");

        for (int i = 0; i < list.size(); i++ ){
            System.out.println(list.get(i));
        }



    }

    public void printSwimTypesDisplay(){
        // TODO EVT FÅ PRINT TIL AT FJERNE SVØMME DICIPLINERNE NÅR MAN VÆGLER DEM.
        System.out.println("Svømme dicipliner:");
        System.out.println(" [1] Crawl");
        System.out.println(" [2] Ryg Crawl:");
        System.out.println(" [3] Free:");
        System.out.println(" [4] Butterfly:");
        System.out.println(" [5] Breast:");

        System.out.println(" [6] Done:");
    }
    public void askForBirthday(){
        System.out.println("Angiv fødselsdato.");
    }
    public void registerNewMember(){
        System.out.println("\nRegistrer nyt medlem.");
    }
    public void acceptMember(){
        System.out.println("Accepter medlem : [1] Accepter | [2] Lav om");
    }
    public void askMemberType(){
        System.out.println("[1] Motionist | [2] Elite ");
    }
    public void hallOfFame(ArrayList<SwimResult> free, ArrayList<SwimResult> crawl, ArrayList<SwimResult> butterfly,
                           ArrayList<SwimResult> breast, ArrayList<SwimResult> backstroke){

        System.out.println("\nFRI\n");

        for(int i = 0; i < free.size() && i < 5; i++){
            if(free.get(i).getCompetitionName() == null){
            System.out.println(free.get(i).getName() + " : Fri " + free.get(i).getTime() + " sekunder, trænings resultat fra " + free.get(i).getDate());
            }
            else{
                System.out.println(free.get(i).getName() + " : Fri " + free.get(i).getTime() + " sekunder, resultat fra "
                        + free.get(i).getCompetitionName() + " " + free.get(i).getDate() + ". Placering nummer: " + free.get(i).getPosition());
            }

        }
        System.out.println("\nCRAWL\n");

        for(int i = 0; i < crawl.size() && i < 5; i++){
            if(crawl.get(i).getCompetitionName() == null){
                System.out.println(crawl.get(i).getName() + " : Crawl " + crawl.get(i).getTime() + " sekunder, trænings resultat fra " + crawl.get(i).getDate());
            }
            else{
                System.out.println(crawl.get(i).getName() + " : Crawl " + crawl.get(i).getTime() + " sekunder, resultat fra "
                        + crawl.get(i).getCompetitionName() + " " + crawl.get(i).getDate() + ". Placering nummer: " + crawl.get(i).getPosition());
            }

        }
        System.out.println("\nBUTTERFLY\n");

        for(int i = 0; i < butterfly.size() && i < 5; i++){
            if(butterfly.get(i).getCompetitionName() == null){
                System.out.println(butterfly.get(i).getName() + " : Butterfly " + butterfly.get(i).getTime() + " sekunder, trænings resultat fra " + butterfly.get(i).getDate());
            }
            else{
                System.out.println(butterfly.get(i).getName() + " : Butterfly " + butterfly.get(i).getTime() + " sekunder, resultat fra "
                        + butterfly.get(i).getCompetitionName() + " " + butterfly.get(i).getDate() + ". Placering nummer: " + butterfly.get(i).getPosition());
            }

        }
        System.out.println("\nBRYSTSVØMNING\n");
        for(int i = 0; i < breast.size() && i < 5; i++){
            if(breast.get(i).getCompetitionName() == null){
                System.out.println(breast.get(i).getName() + " : Bryst " + breast.get(i).getTime() + " sekunder, trænings resultat fra " + breast.get(i).getDate());
            }
            else{
                System.out.println(breast.get(i).getName() + " : Bryst " + breast.get(i).getTime() + " sekunder, resultat fra "
                        + breast.get(i).getCompetitionName() + " " + breast.get(i).getDate() + ". Placering nummer: " + breast.get(i).getPosition());
            }

        }
        System.out.println("\nRYGCRAWL\n");
        for(int i = 0; i < backstroke.size() && i < 5; i++){
            if(backstroke.get(i).getCompetitionName() == null){
                System.out.println(backstroke.get(i).getName() + " : Ryg " + backstroke.get(i).getTime() + " sekunder, trænings resultat fra " + backstroke.get(i).getDate());
            }
            else{
                System.out.println(backstroke.get(i).getName() + " : Ryg " + backstroke.get(i).getTime() + " sekunder, resultat fra "
                        + backstroke.get(i).getCompetitionName() + " " + backstroke.get(i).getDate() + ". Placering nummer: " + backstroke.get(i).getPosition());
            }

        }


    }
}
