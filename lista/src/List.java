public class List {
    private int[] data; 
    private int fill;   // Fill da lista
    private int size; // Capacidade

    public List(int size) {
        this.size = size;
        this.data = new int[size];
        this.fill = 0;
    }

    public int getFill() {
        return fill;// Retorna o fill
    }

    public void clear() {
        fill = 0; // Limpa a lista
    }

    public boolean isEmpty() {
        return fill == 0; // retorna true se não existir nada na lista
    }

    public boolean isFull() {
        return fill == size; // retorna true se o fill for igual a cap max
    }

    
    public void add(int value) {
        if (isFull()){
            System.out.println("Lista cheia.");
            return;
        }
        this.data[fill++] = value;  // Adiciona um elemento no final da lista
    }

    // Adiciona elemento em uma pos
    public void add(int value, int pos) {
        if (isFull()){
            System.out.println("Lista cheia.");
            return;
        }
        if (pos < 0 || pos > fill){
            System.out.println("posiçao invalida.");
            return;
        }

        for (int i = fill; i > pos; i--) {
            this.data[i] = this.data[i - 1];
        }
        this.data[pos] = value;
        fill++;
        
    }

    // Remove  e retorna um elemento 
    public int remove(int pos) {
        if (isEmpty()){
            System.out.println("Lista vazia.");
            return -1;
        }
        if (pos < 0 || pos > fill){
            System.out.println("posiçao invalida.");
            return -1;
        }

        int value = data[pos];
        for (int i = pos; i < (fill--); i++) {
            data[i] = data[i + 1];
        }
        fill--;
        return value;
        
    }


    public void setData(int value, int pos) {
        if (isEmpty()){
            System.out.println("Lista vazia.");
            return;
        }
        if (pos < 0 || pos > fill){
            System.out.println("posiçao invalida.");
            return;
        }
    
        this.data[pos] = value; // Define valor na pos
    }

    public int getData(int pos) {
        if (isEmpty()){
            System.out.println("Lista vazia.");
            return -1;
        }
        if (pos < 0 || pos > fill){
            System.out.println("posiçao invalida.");
            return -1;
        }
        
        return data[pos];// Retorna o valor na posição 

    }


    // Procura valor e retorna a pos
    public int find(int value) {
        for (int i = 0; i < fill; i++) {
            if (this.data[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
