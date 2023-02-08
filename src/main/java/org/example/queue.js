class Queue{
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
        if(this.head == null){
            console.log("No elements")
        }
        else if(this.size == 1){
            this.head = null
        }
        else{
            this.head = this.head.next
            this.size--
        }
    }
    printQueue(){
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

console.log("Queue:")
let q = new Queue()
q.add(10)
q.add(11)
q.add(12)
q.remove()
q.printQueue()
