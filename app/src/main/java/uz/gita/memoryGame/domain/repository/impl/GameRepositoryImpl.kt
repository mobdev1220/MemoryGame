package uz.gita.memoryGame.domain.repository.impl

import uz.gita.memoryGame.R
import uz.gita.memoryGame.data.comman.enumclas.LevelEnum
import uz.gita.memoryGame.data.comman.enumclas.TypeEnum
import uz.gita.memoryGame.data.comman.model.GameData
import uz.gita.memoryGame.domain.repository.GameRepository
import javax.inject.Inject

class GameRepositoryImpl @Inject constructor() : GameRepository {
    private val alphabetList = ArrayList<GameData>()
    private val animalList = ArrayList<GameData>()
    private val fruitList = ArrayList<GameData>()
    private val toysList = ArrayList<GameData>()
    private val birdList = ArrayList<GameData>()
    private val unicornList = ArrayList<GameData>()
    private val animList = ArrayList<GameData>()
    private val monsterList = ArrayList<GameData>()
    private val emojiList = ArrayList<GameData>()

    init {
        loadList()
    }

    private fun loadList() {

        //ALPHABET LIST
        alphabetList.add(GameData(1, R.drawable.alphabet_1))
        alphabetList.add(GameData(2, R.drawable.alphabet_2))
        alphabetList.add(GameData(3, R.drawable.alphabet_3))
        alphabetList.add(GameData(4, R.drawable.alphabet_4))
        alphabetList.add(GameData(5, R.drawable.alphabet_5))
        alphabetList.add(GameData(6, R.drawable.alphabet_6))
        alphabetList.add(GameData(7, R.drawable.alphabet_7))
        alphabetList.add(GameData(8, R.drawable.alphabet_8))
        alphabetList.add(GameData(9, R.drawable.alphabet_9))
        alphabetList.add(GameData(10, R.drawable.alphabet_10))
        alphabetList.add(GameData(11, R.drawable.alphabet_11))
        alphabetList.add(GameData(12, R.drawable.alphabet_12))
        alphabetList.add(GameData(13, R.drawable.alphabet_13))
        alphabetList.add(GameData(14, R.drawable.alphabet_14))
        alphabetList.add(GameData(15, R.drawable.alphabet_15))
        alphabetList.add(GameData(16, R.drawable.alphabet_16))
        alphabetList.add(GameData(17, R.drawable.alphabet_17))
        alphabetList.add(GameData(18, R.drawable.alphabet_18))
        alphabetList.add(GameData(19, R.drawable.alphabet_19))
        alphabetList.add(GameData(20, R.drawable.alphabet_20))
        alphabetList.add(GameData(21, R.drawable.alphabet_21))
        alphabetList.add(GameData(22, R.drawable.alphabet_22))
        alphabetList.add(GameData(23, R.drawable.alphabet_23))
        alphabetList.add(GameData(24, R.drawable.alphabet_24))
        alphabetList.add(GameData(25, R.drawable.alphabet_25))
        alphabetList.add(GameData(26, R.drawable.alphabet_26))

        //ANIMAL LIST
        animalList.add(GameData(1, R.drawable.anim_1))
        animalList.add(GameData(2, R.drawable.anim_2))
        animalList.add(GameData(3, R.drawable.anim_3))
        animalList.add(GameData(4, R.drawable.anim_4))
        animalList.add(GameData(5, R.drawable.anim_5))
        animalList.add(GameData(6, R.drawable.anim_6))
        animalList.add(GameData(7, R.drawable.anim_7))
        animalList.add(GameData(8, R.drawable.anim_8))
        animalList.add(GameData(9, R.drawable.anim_9))
        animalList.add(GameData(10, R.drawable.anim_10))
        animalList.add(GameData(11, R.drawable.anim_11))
        animalList.add(GameData(12, R.drawable.anim_12))
        animalList.add(GameData(13, R.drawable.anim_13))
        animalList.add(GameData(14, R.drawable.anim_14))
        animalList.add(GameData(15, R.drawable.anim_15))
        animalList.add(GameData(16, R.drawable.anim_16))
        animalList.add(GameData(17, R.drawable.anim_18))
        animalList.add(GameData(18, R.drawable.anim_19))
        animalList.add(GameData(19, R.drawable.anim_20))
        animalList.add(GameData(20, R.drawable.anim_21))
        animalList.add(GameData(21, R.drawable.anim_22))
        animalList.add(GameData(22, R.drawable.anim_23))
        animalList.add(GameData(23, R.drawable.anim_24))
        animalList.add(GameData(24, R.drawable.anim_25))
        animalList.add(GameData(25, R.drawable.anim_26))
        animalList.add(GameData(26, R.drawable.anim_27))
        animalList.add(GameData(27, R.drawable.anim_28))

        //FRUIT LIST
        fruitList.add(GameData(1, R.drawable.fruit_1))
        fruitList.add(GameData(2, R.drawable.fruit_2))
        fruitList.add(GameData(3, R.drawable.fruit_3))
        fruitList.add(GameData(4, R.drawable.fruit_4))
        fruitList.add(GameData(5, R.drawable.fruit_5))
        fruitList.add(GameData(6, R.drawable.fruit_6))
        fruitList.add(GameData(7, R.drawable.fruit_7))
        fruitList.add(GameData(8, R.drawable.fruit_8))
        fruitList.add(GameData(9, R.drawable.fruit_9))
        fruitList.add(GameData(10, R.drawable.fruit_10))
        fruitList.add(GameData(11, R.drawable.fruit_11))
        fruitList.add(GameData(12, R.drawable.fruit_12))
        fruitList.add(GameData(13, R.drawable.fruit_13))
        fruitList.add(GameData(14, R.drawable.fruit_14))
        fruitList.add(GameData(15, R.drawable.fruit_15))
        fruitList.add(GameData(16, R.drawable.fruit_16))
        fruitList.add(GameData(17, R.drawable.fruit_17))
        fruitList.add(GameData(18, R.drawable.fruit_18))
        fruitList.add(GameData(19, R.drawable.fruit_19))
        fruitList.add(GameData(20, R.drawable.fruit_20))
        fruitList.add(GameData(21, R.drawable.fruit_21))
        fruitList.add(GameData(22, R.drawable.fruit_22))
        fruitList.add(GameData(23, R.drawable.fruit_23))
        fruitList.add(GameData(24, R.drawable.fruit_24))
        fruitList.add(GameData(25, R.drawable.fruit_25))
        fruitList.add(GameData(26, R.drawable.fruit_26))

        //TOYS LIST
        toysList.add(GameData(1, R.drawable.toys_1))
        toysList.add(GameData(2, R.drawable.toys_2))
        toysList.add(GameData(3, R.drawable.toys_3))
        toysList.add(GameData(4, R.drawable.toys_4))
        toysList.add(GameData(5, R.drawable.toys_5))
        toysList.add(GameData(6, R.drawable.toys_6))
        toysList.add(GameData(7, R.drawable.toys_7))
        toysList.add(GameData(8, R.drawable.toys_8))
        toysList.add(GameData(9, R.drawable.toys_9))
        toysList.add(GameData(10, R.drawable.toys_10))
        toysList.add(GameData(11, R.drawable.toys_11))
        toysList.add(GameData(12, R.drawable.toys_12))
        toysList.add(GameData(13, R.drawable.toys_13))
        toysList.add(GameData(14, R.drawable.toys_14))
        toysList.add(GameData(15, R.drawable.toys_15))
        toysList.add(GameData(16, R.drawable.toys_16))
        toysList.add(GameData(17, R.drawable.toys_17))
        toysList.add(GameData(18, R.drawable.toys_18))
        toysList.add(GameData(19, R.drawable.toys_19))
        toysList.add(GameData(20, R.drawable.toys_20))
        toysList.add(GameData(21, R.drawable.toys_21))
        toysList.add(GameData(22, R.drawable.toys_22))
        toysList.add(GameData(23, R.drawable.toys_23))
        toysList.add(GameData(24, R.drawable.toys_24))
        toysList.add(GameData(25, R.drawable.toys_25))
        toysList.add(GameData(26, R.drawable.toys_26))

        //BIRDS LIST
        birdList.add(GameData(1, R.drawable.birds_1))
        birdList.add(GameData(2, R.drawable.birds_2))
        birdList.add(GameData(3, R.drawable.birds_3))
        birdList.add(GameData(4, R.drawable.birds_4))
        birdList.add(GameData(5, R.drawable.birds_5))
        birdList.add(GameData(6, R.drawable.birds_6))
        birdList.add(GameData(7, R.drawable.birds_7))
        birdList.add(GameData(8, R.drawable.birds_8))
        birdList.add(GameData(9, R.drawable.birds_9))
        birdList.add(GameData(10, R.drawable.birds_10))
        birdList.add(GameData(11, R.drawable.birds_11))
        birdList.add(GameData(12, R.drawable.birds_12))
        birdList.add(GameData(13, R.drawable.birds_13))
        birdList.add(GameData(14, R.drawable.birds_14))
        birdList.add(GameData(15, R.drawable.birds_15))
        birdList.add(GameData(16, R.drawable.birds_16))
        birdList.add(GameData(17, R.drawable.birds_17))
        birdList.add(GameData(18, R.drawable.birds_18))
        birdList.add(GameData(19, R.drawable.birds_19))
        birdList.add(GameData(20, R.drawable.birds_20))
        birdList.add(GameData(21, R.drawable.birds_21))
        birdList.add(GameData(22, R.drawable.birds_22))
        birdList.add(GameData(23, R.drawable.birds_23))
        birdList.add(GameData(24, R.drawable.birds_24))
        birdList.add(GameData(25, R.drawable.birds_25))
        birdList.add(GameData(26, R.drawable.birds_26))
        birdList.add(GameData(27, R.drawable.birds_27))
        birdList.add(GameData(28, R.drawable.birds_28))
        birdList.add(GameData(29, R.drawable.birds_29))

        //UNICORN LIST
        unicornList.add(GameData(1, R.drawable.u_1))
        unicornList.add(GameData(2, R.drawable.u_2))
        unicornList.add(GameData(3, R.drawable.u_3))
        unicornList.add(GameData(4, R.drawable.u_4))
        unicornList.add(GameData(5, R.drawable.u_5))
        unicornList.add(GameData(6, R.drawable.u_6))
        unicornList.add(GameData(7, R.drawable.u_7))
        unicornList.add(GameData(8, R.drawable.u_8))
        unicornList.add(GameData(9, R.drawable.u_9))
        unicornList.add(GameData(10, R.drawable.u_10))
        unicornList.add(GameData(11, R.drawable.u_11))
        unicornList.add(GameData(12, R.drawable.u_12))
        unicornList.add(GameData(13, R.drawable.u_14))
        unicornList.add(GameData(14, R.drawable.u_15))
        unicornList.add(GameData(15, R.drawable.u_16))
        unicornList.add(GameData(16, R.drawable.u_17))
        unicornList.add(GameData(17, R.drawable.u_18))
        unicornList.add(GameData(18, R.drawable.u_19))
        unicornList.add(GameData(19, R.drawable.u_20))
        unicornList.add(GameData(20, R.drawable.u_21))
        unicornList.add(GameData(21, R.drawable.u_22))
        unicornList.add(GameData(22, R.drawable.u_23))
        unicornList.add(GameData(23, R.drawable.u_24))
        unicornList.add(GameData(24, R.drawable.u_25))
        unicornList.add(GameData(25, R.drawable.u_26))

        //ANIM2 LIST
        animList.add(GameData(1, R.drawable.animals1))
        animList.add(GameData(2, R.drawable.animals2))
        animList.add(GameData(3, R.drawable.animals3))
        animList.add(GameData(4, R.drawable.animals4))
        animList.add(GameData(5, R.drawable.animals5))
        animList.add(GameData(6, R.drawable.animals6))
        animList.add(GameData(7, R.drawable.animals7))
        animList.add(GameData(8, R.drawable.animals8))
        animList.add(GameData(9, R.drawable.animals9))
        animList.add(GameData(10, R.drawable.animals10))
        animList.add(GameData(11, R.drawable.animals11))
        animList.add(GameData(12, R.drawable.animals12))
        animList.add(GameData(13, R.drawable.animals13))
        animList.add(GameData(14, R.drawable.animals14))
        animList.add(GameData(15, R.drawable.animals15))
        animList.add(GameData(16, R.drawable.animals16))
        animList.add(GameData(17, R.drawable.animals17))
        animList.add(GameData(18, R.drawable.animals18))
        animList.add(GameData(19, R.drawable.animals19))
        animList.add(GameData(20, R.drawable.animals20))
        animList.add(GameData(21, R.drawable.animals21))
        animList.add(GameData(22, R.drawable.animals22))
        animList.add(GameData(23, R.drawable.animals23))
        animList.add(GameData(24, R.drawable.animals24))
        animList.add(GameData(25, R.drawable.animals25))
        animList.add(GameData(26, R.drawable.animals26))
        animList.add(GameData(27, R.drawable.animals27))
        animList.add(GameData(28, R.drawable.animals28))
        animList.add(GameData(29, R.drawable.animals29))

        //MONSTER LIST
        monsterList.add(GameData(1, R.drawable.mosters1))
        monsterList.add(GameData(2, R.drawable.mosters2))
        monsterList.add(GameData(3, R.drawable.mosters3))
        monsterList.add(GameData(4, R.drawable.mosters4))
        monsterList.add(GameData(5, R.drawable.mosters5))
        monsterList.add(GameData(6, R.drawable.mosters6))
        monsterList.add(GameData(7, R.drawable.mosters7))
        monsterList.add(GameData(8, R.drawable.mosters8))
        monsterList.add(GameData(9, R.drawable.mosters9))
        monsterList.add(GameData(10, R.drawable.mosters10))
        monsterList.add(GameData(11, R.drawable.mosters11))
        monsterList.add(GameData(12, R.drawable.mosters12))
        monsterList.add(GameData(13, R.drawable.mosters13))
        monsterList.add(GameData(14, R.drawable.mosters14))
        monsterList.add(GameData(15, R.drawable.mosters15))
        monsterList.add(GameData(16, R.drawable.mosters16))
        monsterList.add(GameData(17, R.drawable.mosters17))
        monsterList.add(GameData(18, R.drawable.mosters18))
        monsterList.add(GameData(19, R.drawable.mosters19))
        monsterList.add(GameData(20, R.drawable.mosters20))
        monsterList.add(GameData(21, R.drawable.mosters21))
        monsterList.add(GameData(22, R.drawable.mosters22))
        monsterList.add(GameData(23, R.drawable.mosters23))
        monsterList.add(GameData(24, R.drawable.mosters24))
        monsterList.add(GameData(25, R.drawable.mosters25))

        //EMOJI LIST
        emojiList.add(GameData(1, R.drawable.emoji_1))
        emojiList.add(GameData(2, R.drawable.emoji_2))
        emojiList.add(GameData(3, R.drawable.emoji_3))
        emojiList.add(GameData(4, R.drawable.emoji_4))
        emojiList.add(GameData(5, R.drawable.emoji_5))
        emojiList.add(GameData(6, R.drawable.emoji_6))
        emojiList.add(GameData(7, R.drawable.emoji_7))
        emojiList.add(GameData(8, R.drawable.emoji_8))
        emojiList.add(GameData(9, R.drawable.emoji_9))
        emojiList.add(GameData(10, R.drawable.emoji_10))
        emojiList.add(GameData(11, R.drawable.emoji_11))
        emojiList.add(GameData(12, R.drawable.emoji_12))
        emojiList.add(GameData(13, R.drawable.emoji_13))
        emojiList.add(GameData(14, R.drawable.emoji_14))
        emojiList.add(GameData(15, R.drawable.emoji_15))
        emojiList.add(GameData(16, R.drawable.emoji_16))
        emojiList.add(GameData(17, R.drawable.emoji_17))
        emojiList.add(GameData(18, R.drawable.emoji_18))
        emojiList.add(GameData(19, R.drawable.emoji_19))
        emojiList.add(GameData(20, R.drawable.emoji_20))
        emojiList.add(GameData(21, R.drawable.emoji_21))
        emojiList.add(GameData(22, R.drawable.emoji_22))
        emojiList.add(GameData(23, R.drawable.emoji_23))
        emojiList.add(GameData(24, R.drawable.emoji_24))
        emojiList.add(GameData(25, R.drawable.emoji_25))
        emojiList.add(GameData(26, R.drawable.emoji_26))

    }

    override suspend fun getDataByLeve(level: LevelEnum, type: TypeEnum): List<GameData> {
        val count = level.x * level.y
        when (type) {
            TypeEnum.ALPHABET -> {
                alphabetList.shuffle()
                return alphabetList.subList(0, count / 2)
            }
            TypeEnum.ANIMALS -> {
                animalList.shuffle()
                return animalList.subList(0, count / 2)
            }
            TypeEnum.FRUIT -> {
                fruitList.shuffle()
                return fruitList.subList(0, count / 2)
            }
            TypeEnum.TOYS -> {
                toysList.shuffle()
                return toysList.subList(0, count / 2)
            }
            TypeEnum.BIRDS -> {
                birdList.shuffle()
                return birdList.subList(0, count / 2)
            }
            TypeEnum.U -> {
                unicornList.shuffle()
                return unicornList.subList(0, count / 2)
            }
            TypeEnum.ANIM -> {
                animList.shuffle()
                return animList.subList(0, count / 2)
            }
            TypeEnum.MONSTER -> {
                monsterList.shuffle()
                return monsterList.subList(0, count / 2)
            }
            else -> {
                emojiList.shuffle()
                return emojiList.subList(0, count / 2)
            }

        }
    }
}