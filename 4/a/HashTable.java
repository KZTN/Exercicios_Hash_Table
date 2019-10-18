import java.util.LinkedList;
@SuppressWarnings("fallthrough")
public class HashTable {

    private LinkedList<Integer>[] tabela;
    private int tam;
    public HashTable(int tam) {
        this.tabela = new LinkedList[tam];
        this.tam = tam;
    }
    public boolean HasConflict(int x) {
        if(this.tabela[this.hash(x)] != null) {
            return false;
        }
        return true;
    }

    public void insert(int x) {
        if(HasConflict(x)) {
            tabela[hash(x)].push(x);
        }
        
    }
    private int hash(int key) {
        return key % tam;
    }
    public void print() {
        for(int i = 0; i < tam; i++) {
            System.out.println(tabela[i]);
        }
    }
    
}