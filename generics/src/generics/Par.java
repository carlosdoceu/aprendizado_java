package generics;

import java.util.Objects;

public class Par<C, V>{

    private C chave;

    private V valor;

    public Par() {

    }

    public Par(C chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    public C getChave() {
        return chave;
    }

    public void setChave(C chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.chave);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Par<?, ?> other = (Par<?, ?>) obj;
        return Objects.equals(this.chave, other.chave);
    }



    
}
