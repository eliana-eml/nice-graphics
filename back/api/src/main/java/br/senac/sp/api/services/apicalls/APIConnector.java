package br.senac.sp.api.services.apicalls;

import br.senac.sp.api.domain.analysis.AnalysisDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public abstract class APIConnector {

    protected final String apiKey;
    protected final String url;
    protected final String nameAI;
    protected final ObjectMapper objectMapper;

    protected APIConnector(String apiKey, String url, String nameAI) {
        this.apiKey = apiKey;
        this.url = url;
        this.nameAI = nameAI;
        objectMapper = new ObjectMapper();
    }

    public abstract AnalysisDTO getAnalysisOfText(String text, AIModel model) throws IOException, InterruptedException;



    //do a connection to the API
}
