package com.example.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class Home : Fragment() {

    val adapter = Adapter()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view: View = inflater.inflate(R.layout.fragment_home, container, false)
        createRecyclerView(view)
        return view
    }
    lateinit var viewModel: ViewModel
    private fun createRecyclerView(view: View):View {

        val rv = view.findViewById<RecyclerView>(R.id.rv)
        rv.layoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(ViewModel::class.java)


            adapter.addData(News("拜登病中部署，砸2800亿美元应对中国","0728","当地时间27日，美国参议院以64票对33票，通过了规模高达2800亿美元的“芯片与科学”法案，纽约时报称，该法案“旨在增强美国的制造业和技术优势以应对中国”。\n" +
                    "\n" +
                    "该法案融合了经济和国家安全政策，包括两项对华竞争的重要内容：一是为美国半导体企业提供520亿美元的补贴和额外税收抵免。二是为科研领域提供大约2000亿美元支持，特别是在人工智能、机器人技术、量子计算等尖端领域。"))


            adapter.addData(News("河南舞阳通报一起致1死28伤交通事故","0728","234"))
        adapter.addData(News("国防部：中方对发展中美两军关系是有原则的","0728","234"))
        adapter.addData(News("今年国庆休7天上7天","0728","234"))
        adapter.addData(News("寻找身边的“躺平者”","0748","234"))
        adapter.addData(News("22岁女孩熬夜加班猝死","0728","234"))
        adapter.addData(News("国防部评北约战略文件","0728","【环球时报-环球网报道 记者 邢晓婧】28日，外交部发言人赵立坚主持例行记者会。彭博社记者就中美元首通话进行提问。赵立坚向在场记者询问称，“还有关于中美元首通话的问题吗？我一并回答”。另有外媒提问称，请问能否确认中美元首通话将于今天举行？\n" +
                "\n" +
                "对于上述问题，赵立坚表示，“我的答案很简短，中美两国元首通过各种形式保持沟通，中方将及时发布相关消息。"))
        adapter.addData(News("杭州女子因奶奶病危请假被HR要求证明是亲奶，当事人：公司将赔偿道歉","0726","据媒体报道，在杭州工作的张女士于7月20日接到电话，得知奶奶病危，她向公司请假。张女士提供了诊断证明，但公司的HR要求提供户口本、身份证等，证明患病的确实是其奶奶。张女士表示，由于奶奶病危比较匆忙，她想事后补充材料，但HR并未同意，此事陷入僵局，事发后她提出离职。\n" +
                "\n" +
                "极目新闻记者就此事多次拨打涉事企业电话，但始终未能接通。\n" +
                "\n" +
                "7月28日中午12时许，张女士告诉极目新闻记者，涉事企业会对她进行赔偿和道歉，奶奶目前情况还算稳定，“公司已经给我开具了离职证明，但我还没有办理离职手续。”"))
        adapter.addData(News("陕西一派出所副所长遭嫌犯驾车冲撞因公殉职","0728","据央视报道，陕西咸阳警方通报，7月27日15时许，陕西咸阳兴平市公安局西城派出所副所长陈勇在抓捕涉嫌电信网络诈骗犯罪嫌疑人时，遭犯罪嫌疑人驾车冲撞，严重受伤，经抢救无效，不幸因公殉职，年仅43岁。目前涉案在逃犯罪嫌疑人已全部归案。"))
        adapter.addData(News("女子晒订婚照被造谣“8号技师","0728","在社交平台上分享了自己的订婚照后，安徽的小俞不仅没有得到祝福，反而遭到了网络暴力。这场“社会性死亡”一度让她崩溃，甚至打乱了原本正常的生活。\n" +
                "\n" +
                "此前，杭州女子取快递被造谣出轨、女子因打赏少遭网暴自杀、女孩给学校捐了5万元的巧克力被网暴，还有一名大学毕业生仅仅是因为染了粉红色头发遭受网暴……近年来，由网暴带来的伤害或悲剧一次次上演，如何治理网暴行为也是社会所关注的话题。\n" +
                "\n" +
                "今年全国两会上，最高人民法院工作报告强调：“对侵犯个人信息、煽动网络暴力侮辱诽谤的，依法追究刑事责任。”最高人民检察院工作报告强调：“从严追诉网络诽谤、侮辱、侵犯公民个人信息等严重危害社会秩序、侵犯公民权利犯罪"))
        adapter.addData(News("朝鲜已做好准备应对与美国的任何军事冲突","0728","据央视新闻，据朝中社28日报道，朝鲜劳动党总书记金正恩27日在朝鲜祖国解放战争胜利纪念日的活动中发表演讲。\n" +
                "\n" +
                "金正恩表示，对于韩国总统尹锡悦对朝“先发制人”军事政策的表态，朝鲜已做好应对危机的充分准备，朝鲜的国家核战争遏制力也已做好充分准备，可以迅速地调动绝对力量完成使命。\n" +
                "\n" +
                "金正恩还表示，朝鲜已做好充分准备，应对与美国的任何军事冲突"))
        rv.adapter = adapter
        adapter.setOnItemClickListener {
            Toast.makeText(activity,"Check the detail",Toast.LENGTH_LONG).show()
            viewModel.news.value = it
            val fragmentManager:FragmentManager = parentFragmentManager
            val transition: FragmentTransaction =fragmentManager.beginTransaction()
            transition.replace(R.id.frag,ContentFragment()).addToBackStack(null)
            transition.commit()
        }
//        adapter.setOnItemClickListener {
//            view.findViewById<TextView>(R.id.item_like)
//            Toast.makeText(activity,"LIKE",Toast.LENGTH_LONG).show()
//        }
        fun logIn():Boolean {
            return true
        }
//        adapter.setOnLikeClickListener {
//            if(logIn()){
//                Toast.makeText(activity,"已收藏",Toast.LENGTH_LONG).show()
//            }
//            else{
//                parentFragmentManager.beginTransaction().replace(R.id.frag,LogInFragment())
//            }
//        }
        return view
    }


}