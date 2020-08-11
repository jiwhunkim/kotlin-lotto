
import model.WinningLotto
import model.WinningResult
import view.InputView
import view.ResultView

fun main() {
    var money = InputView.getMoney()
    val lottoGame = LottoGame()

    val lottoList = lottoGame.buy(money)

    ResultView.printLottoList(lottoList)

    var prize = InputView.getPrizeLotto()

    val bonusBall = InputView.getBonusBall()
    val winningLotto = WinningLotto(prize, bonusBall)

    val lottoStatList = WinningResult.of(lottoList, winningLotto)
    ResultView.printLottoStat(lottoStatList)

    val earningRate = WinningResult.earningRate(lottoStatList, money)
    ResultView.printEarningRate(earningRate)
}
