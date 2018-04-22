def update(node, path, value):
  if path == '':
    curnode = db.get(node) if node else [ NULL ] * 17
    newnode = curnode.copy()
    newnode[-1] = value
  else:
    curnode = db.get(node) if node else [ NULL ] * 17
    newnode = curnode.copy()
    newindex = update(curnode[path[0]], path[1:], value)
    newnode[path[0]] = newindex
  db.put(hash(newnode), newnode)
  return hash(newnode)
  
def delete(node, path):
  if node is NULL:
    return NULL
  else:
    curnode = db.get(node)
    newnode = curnode.copy()
    if path == '':
      newnode[-1] = NULL
    else: 
      newindex = delete(curnode[path[0]], path[1:])
      newnode[path[0]] = newindex
    
    if len(filter(x -> x is not NULL, newnode)) == 0:
      return NULL
    else: 
      db.put(hash(newnode), newnode)
      return hash(newnode)
