package calculo;

import calculo.Calculo;
import calculo.CalculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/calculo")
public class CalculoController {

    @Autowired
    private CalculoService service;

    @PostMapping("/media")
    public ResponseEntity<Double> calcularMedia(@RequestBody List<Integer> lista) {
        Calculo calculo = this.service.calcularMedia(lista);
        double media = calculo.getMedia();
        return ResponseEntity.ok(media);
    }

    @PostMapping("/minimo")
    public ResponseEntity<Integer> calcularMinimo(@RequestBody List<Integer> lista) {
        Calculo calculo = this.service.calcularMinimo(lista);
        int minimo = calculo.getMinimo();
        return ResponseEntity.ok(minimo);
    }

    @PostMapping("/maximo")
    public ResponseEntity<Integer> calcularMaximo(@RequestBody List<Integer> lista) {
        Calculo calculo = this.service.calcularMaximo(lista);
        int maximo = calculo.getMaximo();
        return ResponseEntity.ok(maximo);
    }

    @PostMapping("/mediana")
    public ResponseEntity<Double> calcularMediana(@RequestBody List<Integer> lista) {
        Calculo calculo = this.service.calcularMediana(lista);
        double mediana = calculo.getMediana();
        return ResponseEntity.ok(mediana);
    }

    @PostMapping("/desvioPadrao")
    public ResponseEntity<Double> calcularDesvioPadrao(@RequestBody List<Integer> lista) {
        Calculo calculo = this.service.calcularDesvioPadrao(lista);
        double desvioPadrao = calculo.getDesvioPadrao();
        return ResponseEntity.ok(desvioPadrao);
    }
}
