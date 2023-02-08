class Stack{
    constructor(){
        this.head = null
        this.size = 0
    }
    add(element){
        let node = new Node(element)
        let current
        if(this.head == null){
            this.head = node
        }
        else{
            current = this.head
            while(current.next){
                current = current.next
            }
            current.next = node
        }
        this.size++
    }
    remove(){
        let current
        let previous
        if(this.head == null){
            console.log("Stack Empty")
        }
        else{
            current = this.head
            while(current.next){
                previous = current
                current = current.next;
            }
            previous.next = null
        }
        this.size--
    }
    printStack(){
        let current
        if(this.head!=null){
            current = this.head
            while(current){
                console.log(current.data)
                current = current.next
            }
        }
        else{
            console.log("Queue Empty");
        }
    }

}
console.log("Stack:")
let s = new Stack()
s.add(7)
s.add(8)
s.add(9)
s.remove()
s.printStack()
