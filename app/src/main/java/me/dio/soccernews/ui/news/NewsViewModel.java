package me.dio.soccernews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;
import java.util.List;

import me.dio.soccernews.doman.News;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        this.news = new MutableLiveData<>();

        //TODO Remover MOck de Notícias
        List<News> news = new ArrayList<>();
        news.add(new News("Onda de lesões desfalca seleções nas competições internacionais do futebol feminino", "Sem Copa do Mundo nem qualquer outra competição de relevo no futebol masculino, julho de 2022 virou o mês das mulheres. Quatro campeonatos continentais femininos de seleções serão disputados simultaneamente: Copa América, Eurocopa, Copa Africana de Nações e o Campeonato da Concacaf. Mas o desfile de craques mundiais já está seriamente prejudicado por causa de uma onda de lesões."));
        news.add(new News("Resistência feminina", "Férias coletivas, salários atrasados e o investimento de R$ 40 mil por mês foram as justificativas do Sport - em 2019 - para dissolver o futebol feminino. O risco de punição - na época - interrompeu o processo, mas o departamento nunca mais foi o mesmo. Desde então, resiste. Três anos após a decepção, elas enfim voltam a comemorar."));
        news.add(new News("Me chamaram de macaca", "Natasha do Nascimento relatou gritos racistas da torcida na partida contra o Sport, na Ilha do Retiro, pelas oitavas de final do Brasileiro Feminino da Série A-3. A atacante atua pelo Doce Mel, da Bahia, e revelou o caso em entrevista ao ge, no último domingo. Ela também relatou o caso para a árbitra Deborah Cecilia, que conduziu o duelo e registrou o ocorrido na súmula."));

        this.news.setValue(news);
    }

    public LiveData<List<News>> getNews() {
        return this.news;
    }
}