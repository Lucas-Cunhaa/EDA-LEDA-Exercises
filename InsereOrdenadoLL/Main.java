public void inserOrdenado (Node n) {
    if(isEmpty() || this.head.value > n.value) addFirst(n) return;

    Node aux = head;

    while(aux != null && n.value > aux.value) aux = aux.next;
    
    if(aux == null) {
        n.prev = this.tail;
        this.tail.next = n;
        this.tail = n;
    } else {
        aux.prev.next = n;
        n.next = aux;
        n.prev = aux.prev;
        aux.prev = n;
    } 
}