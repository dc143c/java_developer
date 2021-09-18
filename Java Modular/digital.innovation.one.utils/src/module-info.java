//Definimos a visibilidade adicionando o outro package como dependência, tendo assim uma dependência de duplo vínculo exclusiva.
module digital.innovation.one.utils {
    exports digital.innovation.one.utils to digital.innovation.one.main.core;
}