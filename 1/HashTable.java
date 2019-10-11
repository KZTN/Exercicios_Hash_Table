import java.util.LinkedList;
@SuppressWarnings("fallthrough")
public class HashTable {

    private LinkedList<Character>[] tabela;

    public HashTable(int tam) {
        tabela = new LinkedList[tam];
        for (int i = 0; i < tabela.length; i++) {
            tabela[i] = new LinkedList<>();
        }
    }
    
    public char search(char x) {
        LinkedList<Character> match = tabela[hash(ascii(x))];
        for(char item : match) {
            if(x == item) {
                return item;
            }
        }
        return '0';
    }
    private int ascii(char x) {
        return (int) x;
    }
    public void insert(char x) {
        tabela[hash(ascii(x))].push(x);
    }
    
    public void remove(char x) {
        tabela[hash(ascii(x))].remove(search(x));
    }
    
    private int hash(int key) {
        return key % tabela.length;
    }
    
    public void print() {
        for (int i = 0; i < tabela.length; i++) {
            System.out.print("["+(i+1)+"] ");
            for (int j = 0; j < tabela[i].size(); j++) {
                System.out.print(tabela[i].get(j)+" - ");
            }
            System.out.println();
        }
    }
    
}