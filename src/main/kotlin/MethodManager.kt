class MethodManager {
    private val heap = mutableMapOf<String, Any?>()

    fun insertion(name: String, superClass: String, args: Array<String>){
        val elem = mutableMapOf<String, Any?>("super" to superClass, "methods" to args)
        heap[name] = elem
    }
    
    fun isIn(name: String): Boolean {
        return heap.contains(name)
    }
    
    fun browseMethods(name: String){
        var base:MutableMap<String,Any?> = heap[name] as MutableMap<String, Any?>
        var parents = mutableListOf(name)
        while(base["super"] != null){
            parents.add(base["super"] as String)
            base = heap[base["super"]] as MutableMap<String, Any?>

        }

        parents = parents.subList(0,parents.size - 1)
        var methodsWithParents = mutableMapOf<String,Any?>()
        for (par in parents){
//           var methods = heap[par]["methods"]
        }
    }
}