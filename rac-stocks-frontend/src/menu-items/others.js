// assets
import {
  AppstoreAddOutlined,
  AntDesignOutlined,
  BarcodeOutlined,
  BgColorsOutlined,
  FontSizeOutlined,
  LoadingOutlined
} from '@ant-design/icons';

// icons
const icons = {
  FontSizeOutlined,
  BgColorsOutlined,
  BarcodeOutlined,
  AntDesignOutlined,
  LoadingOutlined,
  AppstoreAddOutlined
};

// ==============================|| MENU ITEMS - UTILITIES ||============================== //

const others = {
  id: 'others',
  title: 'Others',
  type: 'group',
  children: [
    {
      id: 'others-about',
      title: 'About',
      type: 'item',
      url: '/about',
      icon: icons.FontSizeOutlined
    }
  ]
};

export default others;
