package lotto.controller;

import lotto.domain.Lotto;
import lotto.view.InputView;
import lotto.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class LottoController {

    final InputView inputView;
    final OutputView outputView;

    public LottoController(){
        inputView = new InputView();
        outputView = new OutputView();
    }

    public void run(){
        try{
            // todo : Lotto Main Logic 작성
            int purchaseAmount = inputView.inputPurchaseAmount();

            // todo : 금액에 맞춰서 로또 발급
            List<Lotto> purchasedLottos = new ArrayList<>();
            outputView.printPurchasedLottos(purchasedLottos);

            List<Integer> winningLottoNumbers = inputView.inputWinningNumber();
            int bonusNumber = inputView.inputBonusNumber();

            // todo : 당첨 번호에 맞춰서 당첨 결과 계산
            List<Integer> result = new ArrayList<>();
            // todo : 투자 금액과 당첨 결과로 수익률 계산
            double profitRate = 0.0;
            outputView.printResult(result, profitRate);

        } catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }

}