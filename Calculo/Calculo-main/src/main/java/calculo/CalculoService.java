package calculo;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Collections;
import java.util.List;
@Service
public class CalculoService {

    public Calculo calcularMedia(List<Integer> lista) {
        if (lista.size() < 20) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        } else {
            Calculo calculo = new Calculo();
            calculo.setNumDadosRecebidos(lista.size());

            int soma = 0;
            for (int numero : lista) {
                soma += numero;
            }
            double media = (double) soma / calculo.getNumDadosRecebidos();
            calculo.setMedia(media);

            return calculo;
        }
    }

    public Calculo calcularMinimo(List<Integer> lista) {
        if (lista.size() < 20) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        } else {
            Calculo calculo = new Calculo();
            calculo.setNumDadosRecebidos(lista.size());

            int minimo = Collections.min(lista);
            calculo.setMinimo(minimo);

            return calculo;
        }
    }

    public Calculo calcularMaximo(List<Integer> lista) {
        if (lista.size() < 20) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        } else {
            Calculo calculo = new Calculo();
            calculo.setNumDadosRecebidos(lista.size());

            int maximo = Collections.max(lista);
            calculo.setMaximo(maximo);

            return calculo;
        }
    }

    public Calculo calcularMediana(List<Integer> lista) {
        if (lista.size() < 20) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        } else {
            Calculo calculo = new Calculo();
            calculo.setNumDadosRecebidos(lista.size());

            Collections.sort(lista);
            double mediana;
            int meio = lista.size() / 2;

            if (lista.size() % 2 == 0) {
                mediana = (lista.get(meio - 1) + lista.get(meio)) / 2.0;
            } else {
                mediana = lista.get(meio);
            }

            calculo.setMediana(mediana);

            return calculo;
        }
    }

    public Calculo calcularDesvioPadrao(List<Integer> lista) {
        if (lista.size() < 20) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST);
        } else {
            Calculo calculo = new Calculo();
            calculo.setNumDadosRecebidos(lista.size());

            double media = calcularMedia(lista).getMedia();
            double somaDosQuadrados = 0;

            for (int numero : lista) {
                somaDosQuadrados += Math.pow(numero - media, 2);
            }

            double desvioPadrao = Math.sqrt(somaDosQuadrados / lista.size());
            calculo.setDesvioPadrao(desvioPadrao);

            return calculo;
        }
    }
}


