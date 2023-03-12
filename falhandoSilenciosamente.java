// Uma versão da classe que implementa um array com detecção de erros.

class falhandoSilenciosamente {

    private int a[]; // referência ao array
    private int errval; // valor retornado se get() falhar
    public int length; // comprimento público
    
    /* Constrói um array dado seu tamanho e o valor a ser retornado se get() falhar. */
    public falhandoSilenciosamente(int size, int errv) {

      a = new int[size];
      errval = errv;
      length = size;
    }
    
    // Retorna o valor do índice especificado.
    public int get(int index) {
      if(ok(index)) return a[index];
      return errval;
    }
    
    // Configura o valor do índice especificado.
    public boolean put(int index, int val) {
      if(ok(index)) {
        a[index] = val;
        return true;
      }
      return false;
    }
    
    // Retorna true se index estiver dentro dos limites.
    private boolean ok(int index) {
      if(index >= 0 & index < length) return true;
      return false;
    }
  }
  

  