package com.company.workspace.controller.api;

import com.company.workspace.config.auth.PrincipalDetail;
import com.company.workspace.dto.ResponseDto;
import com.company.workspace.model.Board;
import com.company.workspace.repository.BoardRepository;
import com.company.workspace.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardApiController {

    @Autowired
    private BoardService boardService;

    @PostMapping("/api/board")
    public ResponseDto<Integer> save(@RequestBody Board board, @AuthenticationPrincipal PrincipalDetail principal){
        System.out.println("BoardApiController called: save()");
        boardService.writeBoard(board, principal.getUser());
        return new ResponseDto<Integer>(HttpStatus.OK, 1);
    }
}
