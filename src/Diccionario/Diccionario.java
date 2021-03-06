
package Diccionario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Diccionario<K,E> 
{
    private HashMap<K, E> DiccionarioHash;
    private List<HashMap> DiccionarioList;

    public Diccionario(HashMap<K, E> DiccionarioHash, List<HashMap> DicccionarioList) {
        this.DiccionarioHash = DiccionarioHash;
        this.DiccionarioList = DicccionarioList;
    }

    public HashMap<K, E> getDiccionarioHash() {
        return DiccionarioHash;
    }
    public void setDiccionarioHash(HashMap<K, E> DiccionarioHash) {
        this.DiccionarioHash = DiccionarioHash;
    }
    public List<HashMap> getDiccionarioList() {
        return DiccionarioList;
    }
    public void setDiccionarioList(List<HashMap> DiccionarioList) {
        this.DiccionarioList = DiccionarioList;
    }
    
    public boolean agregarElemento(K clave, E valor)
    {
        return this.DiccionarioList.add(DiccionarioHash);
    }
    
    public E recuperarElemento(K clave)
    {
        return this.DiccionarioHash.get(clave);
    }
    
    public List <E> recuperarElementos()
    {
        List<E> lista = (List<E>) new ArrayList<E>((List<E>) DiccionarioHash.values());
        return  lista;
    } 
    
    public boolean eliminarElemento(K clave)
    {
        return this.DiccionarioList.remove(this.DiccionarioHash);
    }

    @Override
    public String toString() {
        return "Diccionario{" + "DiccionarioHash=" + DiccionarioHash + ", DiccionarioList=" + DiccionarioList + '}';
    }
    
}
