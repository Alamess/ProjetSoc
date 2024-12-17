package tn.enicarthage.projetspring.soap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import tn.enicarthage.projetspring.entities.Stage;
import tn.enicarthage.projetspring.entities.StageETE;
import tn.enicarthage.projetspring.entities.StagePFE;
import tn.enicarthage.projetspring.services.IStageService;

import java.util.List;

@Endpoint
public class StageEndpoint {

    @Autowired
    private IStageService stageService;

    @PayloadRoot(namespace = SoapConstants.NAMESPACE_URI, localPart = "GetAllStagesRequest")
    @ResponsePayload
    public GetAllStagesResponse getAllStages(@RequestPayload GetAllStagesRequest request) {
        List<Stage> stages = stageService.getall();

        GetAllStagesResponse response = new GetAllStagesResponse();
        for (Stage stage : stages) {
            tn.enicarthage.projetspring.soap.Stage soapStage = new tn.enicarthage.projetspring.soap.Stage();
            soapStage.setId(stage.getId());
            soapStage.setDescription(stage.getDescription());
            soapStage.setTitre(stage.getTitre());
            soapStage.setNom(stage.getNom());
            soapStage.setDuree(stage.getDuree());
            soapStage.setImg(stage.getImg());
            soapStage.setExpiration(stage.getExpiration());
            soapStage.setNecessarity(stage.getNecessarity());
            response.getStage().add(soapStage);
        }

        return response;
    }

    @PayloadRoot(namespace = SoapConstants.NAMESPACE_URI, localPart = "GetAllStagesPFERequest")
    @ResponsePayload
    public GetAllStagesPFEResponse getAllStagesPFE(@RequestPayload GetAllStagesPFERequest request) {
        List<StagePFE> stages = stageService.getallPFE();

        GetAllStagesPFEResponse response = new GetAllStagesPFEResponse();
        for (StagePFE stage : stages) {
            tn.enicarthage.projetspring.soap.Stage soapStage = new tn.enicarthage.projetspring.soap.Stage();
            soapStage.setId(stage.getId());
            soapStage.setDescription(stage.getDescription());
            soapStage.setTitre(stage.getTitre());
            soapStage.setNom(stage.getNom());
            soapStage.setDuree(stage.getDuree());
            soapStage.setImg(stage.getImg());
            soapStage.setExpiration(stage.getExpiration());
            soapStage.setNecessarity(stage.getNecessarity());
            response.getStage().add(soapStage);
        }

        return response;
    }
    @PayloadRoot(namespace = SoapConstants.NAMESPACE_URI, localPart = "GetAllStagesETERequest")
    @ResponsePayload
    public GetAllStagesETEResponse getAllStagesETE(@RequestPayload GetAllStagesETERequest request) {
        List<StageETE> stages = stageService.getallETE();

        GetAllStagesETEResponse response = new GetAllStagesETEResponse();
        for (StageETE stage : stages) {
            tn.enicarthage.projetspring.soap.Stage soapStage = new tn.enicarthage.projetspring.soap.Stage();
            soapStage.setId(stage.getId());
            soapStage.setDescription(stage.getDescription());
            soapStage.setTitre(stage.getTitre());
            soapStage.setNom(stage.getNom());
            soapStage.setDuree(stage.getDuree());
            soapStage.setImg(stage.getImg());
            soapStage.setExpiration(stage.getExpiration());
            soapStage.setNecessarity(stage.getNecessarity());
            response.getStage().add(soapStage);
        }

        return response;
    }
}