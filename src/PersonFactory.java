import java.util.ArrayList;

public class PersonFactory {

    private ArrayList<Person> allPersons;

    public PersonFactory() { allPersons = new ArrayList<>();}

    public void addPerson(Person person) {
    if(allPersons.size() == 0){
        allPersons.add(person);
        return;
    }
    int i = 0;
    for(Person person1 : allPersons){
        if(person.getLastName().compareTo(person1.getLastName()) < 0){
            allPersons.add(i, person);
            break;
        }
        i++;
    }

    }

    public ArrayList<Person> under18() {
        ArrayList<Person> under18 = new ArrayList<>();
        for (int i = 0; i < allPersons.size() - 1; i++) {
            if (allPersons.get(i).getAge() < 18) {
                under18.add(allPersons.get(i));
            }
        }
        return under18;
    }

    public boolean checkLastName(String lastName) {
        boolean checkLastName = false;
        for(Person person1 : allPersons){
            if(person1.getLastName().equals(lastName)){
                checkLastName = true;
                break;
                }
            }
            return checkLastName;
        }
    }

